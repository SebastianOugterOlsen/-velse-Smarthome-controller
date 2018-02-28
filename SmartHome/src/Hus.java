public class Hus {



        private Lys[] lys = new Lys[4];
        private Varme[] varme = new Varme[4];


        public Hus(){
            Lokation stue = new Lokation("Stuen");
            Lokation bad = new Lokation("Badeværelse");
            Lokation sove = new Lokation("Soveværelse");
            Lokation køkken = new Lokation("Køkken");

            Lys lysStue = new Lys();
            Lys lysBad = new Lys();
            Lys lysSove = new Lys();
            Lys lysKøkken = new Lys();
            Varme varmeStue = new Varme();
            Varme varmeBad = new Varme();
            Varme varmeSove = new Varme();
            Varme varmeKøkken = new Varme();

            lys[1] = lysStue;
            lys[2] = lysBad;
            lys[3] = lysSove;
            lys[4] = lysKøkken;
            varme[1] = varmeStue;
            varme[2] = varmeBad;
            varme[3] = varmeSove;
            varme[4] = varmeKøkken;


        }
    }

