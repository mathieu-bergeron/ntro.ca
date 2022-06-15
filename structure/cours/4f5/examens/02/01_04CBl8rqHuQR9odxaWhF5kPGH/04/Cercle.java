public class Cercle extends Forme {

    @Override
    public void draw(GraphicsContext gc) {
        gc.save();
        
        gc.{1:MCS:=setFill~setColor~setBackground}(getCouleurFxml());

        gc.{1:MCS:=fillArc~drawArc~fillCircle~drawCircle~clearArc~clearCircle}({1:MCS:=getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~360~ArcType.CHORD}, 
                    {1:MCS:getTopLeftX()~=getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~360~ArcType.CHORD},
                    {1:MCS:getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~=getWidth()~getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~360~ArcType.CHORD}, 
                    {1:MCS:getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~=getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~360~ArcType.CHORD}, 
                    {1:MCS:getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~getHeight()~=0~getWorld().getWidth()~getWorld().getHeight()~360~ArcType.CHORD}, 
                    {1:MCS:getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~=360~ArcType.CHORD}, 
                    {1:MCS:getTopLeftX()~getTopLeftY()~getSpeedX()~getSpeedY()~getAnchorX()~getAnchorY()~getWidth()~getHeight()~0~getWorld().getWidth()~getWorld().getHeight()~360~=ArcType.CHORD});
        
        gc.restore();
        
    }
