/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.Condition#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Text)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getCondition_Expression()
   * @model containment="true"
   * @generated
   */
  Text getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Condition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Text value);

  /**
   * Returns the value of the '<em><b>Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' containment reference.
   * @see #setInfo(ConcreteCondition)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getCondition_Info()
   * @model containment="true"
   * @generated
   */
  ConcreteCondition getInfo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Condition#getInfo <em>Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' containment reference.
   * @see #getInfo()
   * @generated
   */
  void setInfo(ConcreteCondition value);

} // Condition