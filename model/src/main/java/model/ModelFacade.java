package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    @Override
    public Example getExampleById(final int id) throws SQLException {
        	return ExampleDAO.getExampleById(id);
     }
    
    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    /*@Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }*/

}
