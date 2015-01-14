/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/willner/repositories/github/openmultinet/playground-rspecs-ontology/src/main/resources/omn-component.ttl 
 * @author Auto-generated by schemagen on 14 Jan 2015 11:40 
 */
public class Omn_component {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-component#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2014-12-7";
    
    public static final OntClass CPU = m_model.createClass( "http://open-multinet.info/ontology/omn-component#CPU" );
    
    public static final OntClass MemoryComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#MemoryComponent" );
    
    public static final OntClass ProcessingComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#ProcessingComponent" );
    
    public static final OntClass StorageComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#StorageComponent" );
    
}
