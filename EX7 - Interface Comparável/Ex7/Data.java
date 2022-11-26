package Ex7;
public class Data implements Comparavel {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean maior(Comparavel obj) {
        Data downcast = (Data) obj;

        if (this.ano > (downcast).ano) {
            return true;
        } else if (this.ano == (downcast).ano) {
            if (this.mes > (downcast).mes) {
                return true;
            } else if (this.mes == (downcast).mes) {
                if (this.dia > (downcast).dia) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean menor(Comparavel obj) {
        Data downcast = (Data) obj;

        if (this.ano < (downcast).ano) {
            return true;
        } else if (this.ano == (downcast).ano) {
            if (this.mes < (downcast).mes) {
                return true;
            } else if (this.mes == (downcast).mes) {
                if (this.dia < (downcast).dia) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean igual(Comparavel obj) {
        Data downcast = (Data) obj;

        if (this.ano == (downcast).ano) {
            if (this.mes == (downcast).mes) {
                if (this.dia == (downcast).dia) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
