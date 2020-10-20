package EstruturaDinamicas_Busca;

public class No {
    private String Info;
    private int Id;
    
    No proximo;
    /** PONTEIRO
     * Faz referência ao endereço de memória
     * do tipo No;
     */
    public No() {
        this.Info = "";
        this.Id = -1;
    }
    public No(String Info, int Id) {
        this.Info = Info;
        this.Id = Id;
    }

    public String getInfo() {
        return Info;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public void setInfo(String Info) {
        this.Info = Info;
    }

    @Override
    public String toString() {
        if(proximo != null) {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
              + " - " +
              "No -> id: " + this.getId() + " - " +
              "Valor: " + this.getInfo() + " - " +
              "Ponteiro proximo: " + this.proximo.getClass() + "@" + 
                    Integer.toHexString(proximo.hashCode());
        } else {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
                    + " - " +
                    "No -> id: " + this.getId() + " - " +
                    "Valor: " + this.getInfo() + " - " +
                    "Ponteiro proximo: " + "null";
        }    
    }
}
