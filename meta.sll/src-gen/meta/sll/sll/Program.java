/**
 */
package meta.sll.sll;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.sll.sll.Program#getDefs <em>Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.sll.sll.SllPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
   * The list contents are of type {@link meta.sll.sll.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defs</em>' containment reference list.
   * @see meta.sll.sll.SllPackage#getProgram_Defs()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefs();

} // Program
