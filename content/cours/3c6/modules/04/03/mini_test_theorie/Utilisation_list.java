List<String> listeChaines = new ArrayList<>();    // 1
List<Double> listeNombres = new ArrayList<>();    // 2
List<ValeurJson> listeJson = new ArrayList<>();   // 3

listeChaines.add("ab"); // 4
listeChaines.add(12);   // 5
listeChaines.add("cd"); // 6

listeChaines.add(1,"bc");  // 7
listeChaines.set(2,"bb");     // 8

listeNombres.add(3.6);   // 9   
listeNombres.add(0.4);   // 10
listeNombres.add(false); // 11

if(listeNombres.contains(3.6)){
    listeNombres.remove(3.6);      // 12

}

listJson.add(new MaChaineJson("ab"));  // 13
listJson.add(new MonNombreJson(3.6));  // 14
listJson.add(new MonNullJson());       // 15

listeJson.clear();                     // 16
