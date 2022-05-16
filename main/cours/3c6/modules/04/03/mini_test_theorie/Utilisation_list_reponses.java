List<String> listeChaines = new ArrayList<>();    // []
List<Double> listeNombres = new ArrayList<>();    // []
List<ValeurJson> listeJson = new ArrayList<>();   // []

listeChaines.add("ab"); // ["ab"]
listeChaines.add(12);   // Erreur de compilation et pas ["ab",12]
listeChaines.add("cd"); // ["ab","cd"] et pas ["ab",12,"cd"]

listeChaines.insert(1,"bc");  // ["ab","bc","cd"] et pas ["ab","cd","bc"]
listeChaines.set(2,"bb");     // ["ab","bc","bb"] et pas ["ab","bb","cd"]

listeNombres.add(3.6);   // [3.6]
listeNombres.add(0.4);   // [3.6,0.4]
listeNombres.add(false); // Erreur de compilation et pas [3.6,0.4,false]

if(listeNombres.contains(3.6)){
    listeNombres.remove(3.6);      // [0.4]

}

listJson.add(new MaChaineJson("ab"));  // ["ab"]
listJson.add(new MonNombreJson(3.6));  // ["ab",3.6]
listJson.add(new MonNullJson());       // ["ab",3.6,null]

listeJson.clear();                     // []
