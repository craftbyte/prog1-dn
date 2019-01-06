//63180127
// V prejsnji vrstici navedite svojo vpisno "stevilko.
import java.util.*;
public class Naloga {

    public static class Predmet {
        private int sifra;
        private String naziv;
        private int kt;
        private int tip;
        private Modul modul;
        private Izvajalec[] izvajalci;

        public Predmet(int sifra, String naziv, int kt, int tip, Modul modul, Izvajalec[] izvajalci) {
            this.sifra = sifra;
            this.naziv = naziv;
            this.kt = kt;
            this.tip = tip;
            this.modul = modul;
            this.izvajalci = izvajalci;
        }

        @Override
        public String toString() {
            return String.format("%d (%s)", this.sifra, this.naziv);
        }
    }

    public static class Modul {
        private int sifra;
        private String naziv;

        public Modul(int sifra, String naziv) {
            this.sifra = sifra;
            this.naziv = naziv;
        }

        @Override
        public String toString() {
            return String.format("%d (%s)", this.sifra, this.naziv);
        }
    }

    public static class Izvajalec {
        private int sifra;
        private String ip;

        public Izvajalec(int sifra, String ip) {
            this.sifra = sifra;
            this.ip = ip;
        }

        @Override
        public String toString() {
            return String.format("%d (%s)", this.sifra, this.ip);
        }
    }

    public static class Predmetnik {
        private Predmet[] predmeti;

        public Predmetnik(Predmet[] predmeti) {
            this.predmeti = predmeti;
        }

        public int steviloKT() {
            int sum = 0;
            for(Predmet predmet: this.predmeti) {
                sum += predmet.kt;
            }
            return sum;
        }

        public int[] tipiPredmetov() {
            int sum0 = 0;
            int sum1 = 0;
            int sum2 = 0;
            for(Predmet predmet: this.predmeti) {
                switch(predmet.tip) {
                    case 0:
                    sum0++;
                    break;
                    case 1:
                    sum1++;
                    break;
                    case 2:
                    sum2++;
                    break;
                }
            }
            return new int[] {sum0, sum1, sum2};
        }

        public Predmet predmetZNajvecIzvajalci() {
            Predmet topPredmet = null;
            int maxIzvajalci = 0;
            for(Predmet predmet: this.predmeti) {
                if (predmet.izvajalci.length > maxIzvajalci) {
                    topPredmet = predmet;
                    maxIzvajalci = predmet.izvajalci.length;
                    continue;
                }
                if (predmet.izvajalci.length == maxIzvajalci && predmet.sifra < topPredmet.sifra) {
                    topPredmet = predmet;
                    maxIzvajalci = predmet.izvajalci.length;
                    continue;
                }
            }
            return topPredmet;
        }

        public int predmetiModula(int sifra, String[] nazivi) {
            int count = 0;
            for(Predmet predmet: this.predmeti) {
                if (predmet.modul != null && predmet.modul.sifra == sifra) {
                    nazivi[count++] = predmet.naziv;
                }
            }
            return count;
        }

        public int steviloIzvajalcev() {
            List<Integer> izvajalci = new ArrayList<Integer>();
            for(Predmet predmet: this.predmeti) {
                for (Izvajalec izvajalec: predmet.izvajalci) {
                    if (!izvajalci.contains(izvajalec.sifra)) izvajalci.add(izvajalec.sifra);
                }
            }
            return izvajalci.size();
        }

        public int steviloEnakoMocnihModulov(Predmetnik drugi) {
            Map<Integer, Integer> mojiModuli = new HashMap<Integer, Integer>();
            Map<Integer, Integer> njihoviModuli = new HashMap<Integer, Integer>();
            for(Predmet predmet: this.predmeti) {
                if (predmet.modul == null) continue;
                int sifra = predmet.modul.sifra;
                if (!mojiModuli.containsKey(sifra)) mojiModuli.put(sifra, 0);
                mojiModuli.put(sifra, mojiModuli.get(sifra)+1);
            }
            for(Predmet predmet: drugi.predmeti) {
                if (predmet.modul == null) continue;
                int sifra = predmet.modul.sifra;
                if (!njihoviModuli.containsKey(sifra)) njihoviModuli.put(sifra, 0);
                njihoviModuli.put(sifra, njihoviModuli.get(sifra)+1);
            }
            Iterator it = mojiModuli.entrySet().iterator();
            int counter = 0;
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (njihoviModuli.containsKey(pair.getKey()) && njihoviModuli.get(pair.getKey()) == pair.getValue()) counter++;
                it.remove(); // avoids a ConcurrentModificationException
            }
            return counter;
        }
    }
}
