package analisadorSemantico;

public class analisadorSemantico{

    public analisadorSemantico() {
    }
    
    public void verificaExpressao(Object operando1, Object operador, Object operando2){
        
        String operadorStr = operador.toString();
        
        switch (operadorStr){
                
            case "<":
                
            case "<=":
            
            case ">":
                
            case ">=":
                  
            case "+":
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                            
            case "-":
                
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                                
            case "*":
                
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                                    
            case "/":
                
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                
                if(operando1 == "0"){
                    //erro
                }
                                        
            case "mod":
                
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                                            
            case "div":
                
                if(operando1 == "true" || operando1 == "false"){
                    //erro
                }else if(operando2 == "true" || operando2 == "false"){
                    //erro
                }
                                               
        }
        
    }
    
}