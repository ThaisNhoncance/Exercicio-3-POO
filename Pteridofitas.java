package classes;

public class Pteridofitas extends Plantae{
    
    public Pteridofitas(String no, int ta, String cl, String es){
 				super(no,ta,cl,es);
	} 
    
 @Override
	public void corpoPlantae(){
		System.out.println("\nDefinição:\nCorpo do(a) "+this.getNome()
		+": possui esporófito, raiz, caule, folhas, trofofilos, esperofilas,"+
        " trofoesporofilos, isosporadas e heterosporadas.\n");
	}
    
 @Override
	public String toString() {
		return "=======================================================================\n" +
		"\n"+this.getNome() +" é da divisão das Pteridofitas!\n" +
				"\nPlantinha Info\n" + "Nome: " + nome + "\nTamanho: " + tamanho + "cm"
		 +"\nClasse: " + classe + "\nEspecie: " + especie + "\n"+
				"\n=======================================================================\n";
	}    
    
    
    
    
    
}
