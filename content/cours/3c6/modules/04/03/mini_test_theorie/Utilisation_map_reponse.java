Map<Integer, String> mapChaines = new HashMap<>();    // {}
Map<Boolean, Double> mapNombres = new HashMap<>();    // {}
Map<String, ValeurJson> objetJson = new HashMap<>();  // {}

mapChaines.put(12, "ab");  // {12:"ab"}
mapChaines.put("ab", 12);  // Erreur de compilation, mais pas {12:"ab","ab":12}
mapChaines.put(12, "cd");  // {12:"cd"} et pas {12:"ab",12:"cd"}
mapChaines.put(53, "ef");  // {12:"cd",53:"ef"}
mapChaines.put("ef", 53);  // Erreur de compilation, mais pas {12:"cd",53:"ef","ef":53}
mapChaines.put(53, "gh");  // {12:"cd",53:"gh"} et pas {12:"cd",53:"ef",53:"gh"}

mapNombres.put(true, 0.4);  // {true:0.4}
mapNombres.put(false, 3.6); // {true:0.4,false:3.6}

mapNombres.remove(false);  // {true:0.4}
mapNombres.remove(0.4);    //   {true:0.4} et pas {}

objetJson.put("cle01", new MaChaineJson("ab"));  // {"cle01":"ab"}
objetJson.put("cle01", new MonNullJson());       // {"cle01:null} et pas {"cle01":"ab","cle01":null}
objetJson.put("cle02", new MonNombreJson(0.4));  // {"cle01":null,"cle02":0.4}
objetJson.put("cle02", new MonNombreJson(3.6));  // {"cle01":null,"cle02":3.6}

if(objetJson.containsValue(new MaChaineJson("ab"))){
    objetJson.remove("cle01");                         
}

objetJson; // {"cle01":null,"cle02":3.6}
