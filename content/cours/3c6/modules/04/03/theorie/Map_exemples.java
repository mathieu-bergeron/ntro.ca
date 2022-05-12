// interface                            implantation
   Map<String, ValeurJson> objetJson  = new HashMap<>(); 
   Map<Integer, String>    parDA      = new TreeMap<>(); 
   Map<StudentId, Billet>  billets    = new LinkedHashMap<>(); 

objetJson.put("attr01", new MonBooleanJson(true));
objetJson.put("attr02", new MonNullJson());

ValeurJson valeur = objetJson.get("attr01");

parDA.put(421235, "Amina");
parDA.put(413354, "Bénison");
parDA.put(565624, "Carlos");
parDA.put(645143, "Delpine");

String nomEtudiant = parDA.get(413354);

StudentId id = new StudentId(645143);

billets.put(id, new Billet());
billets.get(id);
