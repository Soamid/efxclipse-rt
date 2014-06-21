/**
 */
package org.eclipse.fx.code.compensator.hsl.hSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.fx.code.compensator.hsl.hSL.HSLPackage;
import org.eclipse.fx.code.compensator.hsl.hSL.ScannerWhitespaceRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanner Whitespace Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.code.compensator.hsl.hSL.impl.ScannerWhitespaceRuleImpl#getCharacters <em>Characters</em>}</li>
 *   <li>{@link org.eclipse.fx.code.compensator.hsl.hSL.impl.ScannerWhitespaceRuleImpl#getJsMethod <em>Js Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScannerWhitespaceRuleImpl extends ScannerRuleImpl implements ScannerWhitespaceRule
{
  /**
   * The cached value of the '{@link #getCharacters() <em>Characters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacters()
   * @generated
   * @ordered
   */
  protected EList<String> characters;

  /**
   * The default value of the '{@link #getJsMethod() <em>Js Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsMethod()
   * @generated
   * @ordered
   */
  protected static final String JS_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJsMethod() <em>Js Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsMethod()
   * @generated
   * @ordered
   */
  protected String jsMethod = JS_METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScannerWhitespaceRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HSLPackage.Literals.SCANNER_WHITESPACE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCharacters()
  {
    if (characters == null)
    {
      characters = new EDataTypeEList<String>(String.class, this, HSLPackage.SCANNER_WHITESPACE_RULE__CHARACTERS);
    }
    return characters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJsMethod()
  {
    return jsMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsMethod(String newJsMethod)
  {
    String oldJsMethod = jsMethod;
    jsMethod = newJsMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HSLPackage.SCANNER_WHITESPACE_RULE__JS_METHOD, oldJsMethod, jsMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HSLPackage.SCANNER_WHITESPACE_RULE__CHARACTERS:
        return getCharacters();
      case HSLPackage.SCANNER_WHITESPACE_RULE__JS_METHOD:
        return getJsMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HSLPackage.SCANNER_WHITESPACE_RULE__CHARACTERS:
        getCharacters().clear();
        getCharacters().addAll((Collection<? extends String>)newValue);
        return;
      case HSLPackage.SCANNER_WHITESPACE_RULE__JS_METHOD:
        setJsMethod((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HSLPackage.SCANNER_WHITESPACE_RULE__CHARACTERS:
        getCharacters().clear();
        return;
      case HSLPackage.SCANNER_WHITESPACE_RULE__JS_METHOD:
        setJsMethod(JS_METHOD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HSLPackage.SCANNER_WHITESPACE_RULE__CHARACTERS:
        return characters != null && !characters.isEmpty();
      case HSLPackage.SCANNER_WHITESPACE_RULE__JS_METHOD:
        return JS_METHOD_EDEFAULT == null ? jsMethod != null : !JS_METHOD_EDEFAULT.equals(jsMethod);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (characters: ");
    result.append(characters);
    result.append(", jsMethod: ");
    result.append(jsMethod);
    result.append(')');
    return result.toString();
  }

} //ScannerWhitespaceRuleImpl
