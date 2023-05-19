package Laboratorio.Clases.Segundo_Parcial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa implements Informe {
    private List<Cliente> listaClientes;

    public Empresa() {
        this.listaClientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void buscarCliente(int dni) {
        Iterator<Cliente> iterador = listaClientes.iterator();
        while (iterador.hasNext()) {
            int dniCliente = iterador.next().getDni();
            if (dniCliente == dni) {
                System.out.println(iterador.toString());
            }
        }
    }

    public void eliminarCliente(int dni) {
        Iterator<Cliente> iterador = listaClientes.iterator();
        while (iterador.hasNext()) {
            int dniCliente = iterador.next().getDni();
            if (dniCliente == dni) {
                iterador.remove();
            }
        }
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String imprimir() {
        String clientes = listaClientes.toString();
        return clientes;
    }
}
