Canvas laToile = new Canvas(800,600);

GraphicsContext gc = laToile.getGraphicsContext2D();


gc.setFill(Color.rgb(122,233,39));

gc.setStroke(Color.RED);

gc.setLineWidth(3);

gc.fillRectangle(coinHautGaucheX, coinHautGaucheY, largeur, hauteur);

gc.strokeRectangle(coinHautGaucheX, coinHautGaucheY, largeur, hauteur);

gc.save();

gc.setFill(Color.BLUE);
gc.setLineWidth(10);

gc.restore();
gc.clearRect(cointHautGaucheX, coinHautGaucheY, largeur, hauteur);

gc.clearRect(0, 0, getWidth(), getHeight());

