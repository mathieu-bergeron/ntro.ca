Map<Integer, String> mapChaines = new HashMap<>();    // 1
Map<Boolean, Double> mapNombres = new HashMap<>();    // 2
Map<String, ValeurJson> objetJson = new HashMap<>();  // 3

mapChaines.put(12, "ab");  // 4
mapChaines.put("ab", 12);  // 5
mapChaines.put(12, "cd");  // 6
mapChaines.put(53, "ef");  // 7
mapChaines.put("ef", 53);  // 8
mapChaines.put(53, "gh");  // 9

mapNombres.put(true, 0.4);   // 10
mapNombres.put(false, 3.6);  // 11

mapNombres.remove(false);  // 12
mapNombres.remove(0.4);    // 13

objetJson.put("cle01", new MaChaineJson("ab"));  // 14
objetJson.put("cle01", new MonNullJson());       // 15
objetJson.put("cle02", new MonNombreJson(0.4));  // 16
objetJson.put("cle02", new MonNombreJson(3.6));  // 17

if(objetJson.containsValue(new MaChaineJson("ab"))){
    objetJson.remove("cle01");                        
}

objetJson; // 18
