public class Session {
    
    public static String nomUsager;
    public static Forme forme;

    public static void chargerSession(String[] args) {
        if(args.length > {1:MCS:=0~1~2~3~4}) {
            nomUsager = args[{1:MCS:=0~1~2~3~4}];
        }
        
        if(args.length > {1:MCS:0~=1~2~3~4}) {
            forme = creerForme(args[{1:MCS:0~=1~2~3~4}]);
        }

        if(args.length > {1:MCS:0~1~=2~3~4}) {
            forme.setCouleur(args[{1:MCS:0~1~=2~3~4}]);
        }
    }

    private static Forme creerForme(String {1:MCS:=nomForme~couleur~nomUsager}) {
        Forme forme = null;
        
        switch({1:MCS:=nomForme~couleur~nomUsager}) {
        case {1:MCS:="Cercle"~"Triangle"~"Rectangle"~"&#35;B1740F"~"&#35;DB833"~"&#35;96EB4"~"Amina"~"Bob"~"Charlie"}:
            forme = new Cercle({1:MCS:"Cercle"~"&#35;1740F"~"&#35;FDB833"~"&#35;296EB4"~=∅});
            break;
            
        case {1:MCS:"Cercle"~="Triangle"~"Rectangle"~"&#35;B1740F"~"&#35;FDB833"~"&#35;296EB4"}:
            forme = new Triangle({1:MCS:"Cercle"~"&#35;B1740F"~"&#35;FDB833"~"&#35;296EB4"~=∅});
            break;
            
        case {1:MCS:"Cercle"~"Triangle"~="Rectangle"~"&#35;B1740F"~"&#35;FDB833"~"&#35;296EB4"}:
        default:
            forme = new Rectangle({1:MCS:"Cercle"~"&#35;B1740F"~"&#35;FDB833"~"&#35;296EB4"~=∅});
            break;
        }

        return forme;
    }

}
