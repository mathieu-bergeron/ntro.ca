    Timeline animation = new Timeline();
        
    double tempsCle01Milisecondes = 0;
    Duration tempsCle01 = new Duration(tempsCle01Milisecondes);

    KeyValue valeurCle01 = new KeyValue(opacityProperty(), 0.8);

    KeyFrame cle01 = new KeyFrame(tempsCle01, valeurCle01);

    animation.getKeyFrames().add(cle01);


    animation.getKeyFrames()
             .add(new KeyFrame(new Duration(1000),
                               new KeyValue(opacityProperty(),
                                            0.5)));

    animation.setCycleCount(20);

    animation.setCycleCount(-1);

    animation.playFromStart();

    animation.stop();
