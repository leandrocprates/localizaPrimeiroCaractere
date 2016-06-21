# Projeto para busca do primeiro caractere que nao se repete em uma string  

A classe principal do projeto chama **LocalizaPrimeiroCaractere.java**  no pacote **com.mycompany.localizaprimeirocaractere.** , 
ela é quem fara o start da aplicacao e gerará a mensagem de resposta. 

Quando iniciar o projeto a seguinte mensagem irá aparecer : 

**Digite a string de entrada :**

**aAbBABac** - String digitada pelo usuario 



A estrategia adotada para a resolução do problema foi : 


Percorre-se a string e os caracteres são adicionados num : 

```javascript

LinkedHashMap mapCaractereQuantidade = new LinkedHashMap<String,Integer>();
```

com a quantidade de vezes que eles aparecem. O **LinkedHashMap** guarda os caracteres na ordem em que foram inseridos.

No final é feita a iteração no **LinkedHashMap mapCaractereQuantidade** e quando é encontrada a quantidade = 1  o 
caractere é retornado. 




A classe que efetua a leitura do arquivo digitado pelo usuario é chamada **Lentrada.java** . Ela estende a interface **Stream** 
que oferece os metodos : 

```javascript
public interface Stream {
    //Retorna proximo caractere
    public char getNext();
    //Retorna true caso ainda exista caracteres para percorrer
    public boolean hasNext();
}

```

A classe **Lentrada.java** implementa as seguintes funcoes abaixo: 


```javascript


public class Lentrada  implements  Stream{

    private String stringEntreda =null; 
    
    //indice minimo onde comeca a leitura
    private int indexMin=0;
    //indice maximo onde termina a leitura
    private int indexMax=0;
    
    /**
     * Funcao responsavel por retornar o proximo caractere
     * @return 
     */
    @Override
    public char getNext() {
        return stringEntreda.charAt(indexMin++);
    }

    /**
     * Funcao responsavel por indicar se ha ainda caracteres para leitura
     * @return 
     */
    @Override
    public boolean hasNext() {
        if (indexMin < indexMax ){
            return true;
        }
        return false;
    }

    
    /**
     * Funcao responsavel por ler a entrada da string digitada pelo usuario
     */
    public void leEntrada(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a string de entrada : "  );
        
        stringEntreda = sc.next(); 
        
        indexMax = stringEntreda.length();
    }
    
    
    /**
     * Funcao responsavel por retornar o caractere que aparece somente uma vez na string
     * @return 
     */
    public char firstChar(){
    
        LinkedHashMap mapCaractereQuantidade = new LinkedHashMap<String,Integer>();
        
        char caractere = '0';
        char caractereRetorno = ' ';
        
        Integer quantidade=null;
        
        while ( hasNext() ){
            
            caractere = getNext();
            
            System.out.println("Caractere: " +caractere);
            
            quantidade = (Integer) mapCaractereQuantidade.get(String.valueOf(caractere)) ; 
            
            if ( quantidade == null ){
                mapCaractereQuantidade.put(String.valueOf(caractere), 1);
            } else {
                quantidade++;
                mapCaractereQuantidade.put(String.valueOf(caractere), quantidade); 
            }
            
        }
        
        Set<Map.Entry<String,Integer>> mapSet = mapCaractereQuantidade.entrySet();
        Iterator<Map.Entry<String,Integer>> it = mapSet.iterator();
        
        while(it.hasNext()){
            Map.Entry<String,Integer>  entry = it.next();
            System.out.println( "Chave: "+entry.getKey() +" , Valor: "+entry.getValue() ) ;
            
            if ( entry.getValue() ==1 ){
                caractereRetorno = entry.getKey().toCharArray()[0] ; 
                break;
            }
            
        }
        
        return caractereRetorno; 
    }
    
    

    
}


```





