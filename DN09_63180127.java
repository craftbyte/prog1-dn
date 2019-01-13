import java.util.*;

public class DN09_63180127 {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Dokument dok = new Dokument();
        while (in.hasNext()) {
            String cmdLine = in.nextLine();
            if (cmdLine.charAt(0) == 'x') break;
            dok.executeCommand(cmdLine);
            System.out.println(dok);
        }
        in.close();
    }


    public static class Dokument {
        private ArrayList<String> lines = new ArrayList<String>();
        private ArrayList<String> commands = new ArrayList<String>();
        private ArrayList<String> undone = new ArrayList<String>();
        private ArrayList<String> removed = new ArrayList<String>();
        private boolean undoing = false;
        private int usage = 0;

        public String toString() {
            String text = "";
            for (int i = 0; i < this.lines.size(); i++) {
                text += this.lines.get(i) + (i != this.lines.size()-1 ? "/" : "");
            }
            return String.format("%d | %s", this.usage, text);
        }

        private void executeCommand(String cmdLine) {
            String[] parts = cmdLine.split(" ");
            char command = cmdLine.charAt(0);
            int index = -1;
            String text = "";
            switch (command) {
                case '+':
                case '-':
                    index = Integer.parseInt(parts[1]);
                case '#':
                    text = parts[parts.length-1];
                    this.commands.add(cmdLine);
                    this.undoing = false;
                    break;
            }
            switch (command) {
                case '+':
                case '#':
                    this.addLine(text, index);
                    break;
                case '-':
                    this.removeLine(index);
                    break;
                case '<':
                    if (!this.undoing) this.undone = new ArrayList<String>();
                    this.undoing = true;
                    this.undo();
                    break;
                case '>':
                    if (!this.undoing) break;
                    redo();
                    break;
            }
        }

        public void addLine(String text, int index) {
            if (index == -1) index = lines.size();
            int price = (lines.size() - index) * 2 + text.length();
            lines.add(index, text);
            this.usage += price;
        }

        public void removeLine(int index) {
            this.removeLine(index, true);
        }

        public void removeLine(int index, boolean save) {
            if (index == -1) index = lines.size() - 1;
            int price = (lines.size() - index - 1) * 3 + this.lines.get(index).length() * 2;
            this.usage += price;
            if (save) this.removed.add(this.lines.get(index));
            this.lines.remove(index);
        }

        public void undo() {
            if (this.commands.size() == 0) return;
            String cmdLine = this.commands.get(this.commands.size() - 1);
            String[] parts = cmdLine.split(" ");
            char command = cmdLine.charAt(0);
            int index = -1;
            if (command == '+' || command == '-') {
                index = Integer.parseInt(parts[1]);
            }
            switch (command) {
                case '+':
                case '#':
                    this.removeLine(index, false);
                    break;
                case '-':
                    this.addLine(this.removed.get(this.removed.size() - 1), index);
                    this.removed.remove(this.removed.size() - 1);
                    break;
            }
            this.undone.add(cmdLine);
            this.commands.remove(this.commands.size() - 1);
        }

        public void redo() {
            if (this.undone.size() == 0) return;
            String cmdLine = this.undone.get(this.undone.size() - 1);
            String[] parts = cmdLine.split(" ");
            char command = cmdLine.charAt(0);
            int index = -1;
            String text = "";
            switch (command) {
                case '+':
                case '-':
                    index = Integer.parseInt(parts[1]);
                case '#':
                    text = parts[parts.length-1];
                    break;
            }
            switch (command) {
                case '+':
                case '#':
                    this.addLine(text, index);
                    break;
                case '-':
                    this.removeLine(index);
                    break;
            }
            this.undone.remove(this.undone.size() - 1);
            this.commands.add(cmdLine);
        }
    }
}
