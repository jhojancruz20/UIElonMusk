public class Reloj{
    protected int segundos;
    protected int minutos;
    protected int horas;
    
    public Reloj(){
        this.horas = 12;
    }
    
    public Reloj(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        
    }

    /**GET Method Propertie segundos*/
    public int getSegundos(){
        return this.segundos;
    }//end method getSegundos

    /**SET Method Propertie segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }//end method setSegundos

    /**GET Method Propertie minutos*/
    public int getMinutos(){
        return this.minutos;
    }//end method getMinutos

    /**SET Method Propertie minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }//end method setMinutos

    /**GET Method Propertie horas*/
    public int getHoras(){
        return this.horas;
    }//end method getHoras

    /**SET Method Propertie horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }//end method setHoras
}