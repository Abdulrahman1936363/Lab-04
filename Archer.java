package cpit252;




public class Archer implements Characters{
    private String name;
    private Avatar avatar;
    
    public Archer(String name){
        if (name == null ) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name=name;
        // TODO: instantiate an avatar builder using Avatar.Builder
        this.avatar=new Avatar.Builder(SkinTone.DARK)
        .withHairColor(HairColor.NONE)
        .withHairType(HairType.BALD).withBodyType(BodyType.FAT).withFacialFeatures(FacialFeatures.GOATEE)
        .build();
    }

    @Override
      public String getName(){
        return this.name;
    }
    
    public Avatar getAvatar(){
        return this.avatar;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAvatar(Avatar avatar){
        this.avatar=avatar;
    }

    public String toString(){
        return this.name+" has "+this.avatar.toString();
    }
    
}
