public enum EnumTreino {
    
    PEITO(1), 
    COSTA(2),
    BÍCEPS(3),
    OMBRO(4), 
    PERNA(5); 

    private final int valor; 

    EnumTreino(int valor){
        this.valor = valor;
    }

    public static EnumTreino fromValor(Integer valor) {
        for (EnumTreino enumTreino : EnumTreino.values()) {
            if (enumTreino.getValor() == valor) {
                return enumTreino;
            }
        }
        throw new IllegalArgumentException("Id inexistente!"); // Lança exceção se não encontrar
    }


    public int getValor() {
        return valor;
    }

    public String toLowerCase(){
        return this.name().toLowerCase();
    }

    

}
