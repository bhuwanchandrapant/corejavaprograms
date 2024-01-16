package exe;

public class rectangle extends shapee{
    rectangle(int dim1, int dim2){
        super(dim1, dim2);

    }
    public int area(){
        return this.dim1 * this.dim2;
    }
    
}
