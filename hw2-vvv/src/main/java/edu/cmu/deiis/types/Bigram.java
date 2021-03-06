

/* First created by JCasGen Mon Sep 23 18:46:04 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An n-gram of size 2.
 * Updated by JCasGen Mon Sep 23 19:21:37 EDT 2013
 * XML source: /Users/vvvemuri1/git/hw2/hw2-vvv/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Bigram extends NGram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Bigram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Bigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Bigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Bigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Bigram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    