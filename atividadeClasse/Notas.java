package atividadeClasse;

public class Notas {

    public double portugues; 
    public double ingles;
    public double matematica; 
    public double media;
    public String situacao;

    
    public void setPortugues(double portugues){

        this.portugues = portugues;
}

    public double getPortugues(){

        return this.portugues;

}

    public void setIngles(double ingles){

        this.ingles = ingles;
}

    public double getIngles(){

    return this.ingles; 
}

    public void setMatematica(double matematica){

        this.matematica = matematica;

}

    public double getMatematica(){

        return this.matematica;

}

    public void setMedia(Notas self){

        this.media = (self.portugues + self.ingles + self.matematica) / 3;

}

    public double getMedia(){

        return this.media;

        }    
    
    public void setSituacao(String situacao){

        this.situacao = situacao;
        
        }
    
    public double getSituacao(){
    
        return this.media;

    } 
}
    

