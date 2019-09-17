/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ValorDao;
import modelo.Valor;
import exceptions.BusinessException;
import exceptions.ConexaoException;
import exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Accel
 */
public class ValorBusiness {
    
    private final ValorDao dao = new ValorDao();
    
    public boolean incluir(Valor valor) throws BusinessException {

  try{        
        validarCampos(valor);
        dao.inserir(valor);
        
     }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}    
        return true;

	}
    
    public Valor alterar(Valor valor) throws BusinessException {

        try{
        validarCampos(valor);
        dao.atualizar(valor);
        }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}

		return valor;

	}
    
    public void excluir(Integer id) throws BusinessException {

        try{
        verificarExistencia(id);
        dao.excluir(id);
        }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}

	}
    
    public List<Valor> listar() throws BusinessException {

        try{
        return dao.listar();
        }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}

	}
    
    public Valor Buscar(Integer id) throws BusinessException {

        verificarExistencia(id);
        try{
        return dao.buscar(id);
        }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}

	}
    
    public void validarCampos(Valor valor) throws BusinessException {

		if (valor.getTitulo()== null || valor.getTitulo().equals("") || valor.getTitulo().trim().length() > 25) {

			throw new BusinessException("O titulo do valor é invalido.");

		}

		if (valor.getEtiqueta()== null || valor.getEtiqueta().equals("")) {

			throw new BusinessException("O Valor deve contar pelo menos uma etiqueta.");

		}

		if (valor.getObservacao().trim().length() > 50) {

			throw new BusinessException("Observação invalida.");

		}

		if (valor.getValor()<=0) {

			throw new BusinessException("Valor invalido.");

		}
		
	}

	public void verificarDuplicidade(Integer id) throws BusinessException {

            try{
            Valor x = dao.buscar(id);
            if (x != null) {
                
                throw new BusinessException("Valor já existe.");
                
			}
            }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}
	}
	
	public void verificarExistencia(Integer id) throws BusinessException {

            try{
            Valor x = dao.buscar(id);
            if (x == null) {
                
                throw new BusinessException("Valor não existe.");
                
			}
            }catch (ConexaoException | DAOException e) {

			throw new BusinessException(e.getMessage());

		}
	}

    
}
