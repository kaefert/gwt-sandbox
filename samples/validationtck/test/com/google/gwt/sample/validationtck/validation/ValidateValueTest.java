/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.validationtck.validation;

import com.google.gwt.sample.validationtck.util.Failing;


/**
 * Test wrapper for
 * {@link org.hibernate.jsr303.tck.tests.validation.ValidateValueTest}.
 */
public class ValidateValueTest extends AbstractValidationTest {

  private final org.hibernate.jsr303.tck.tests.validation.ValidateValueTest delegate =
      new org.hibernate.jsr303.tck.tests.validation.ValidateValueTest();

  @Failing(issue = 5804)
  public void testExistingPropertyWoConstraintsNorCascaded() {
    delegate.testExistingPropertyWoConstraintsNorCascaded();
  }

  @Failing(issue = 5804)
  public void testValidateValue() {
    delegate.testValidateValue();
  }

  @Failing(issue = 5804)
  public void testValidateValueFailure() {
    delegate.testValidateValueFailure();
  }

  public void testValidateValuePassingNullAsGroup() {
    delegate.testValidateValuePassingNullAsGroup();
  }

  public void testValidateValueSuccess() {
    delegate.testValidateValueSuccess();
  }

  public void testValidateValueWithEmptyPropertyPath() {
    delegate.testValidateValueWithEmptyPropertyPath();
  }

  public void testValidateValueWithInvalidPropertyPath() {
    delegate.testValidateValueWithInvalidPropertyPath();
  }

  public void testValidateValueWithNullObject() {
    delegate.testValidateValueWithNullObject();
  }

  public void testValidateValueWithNullPropertyName() {
    delegate.testValidateValueWithNullPropertyName();
  }

  @Failing(issue = 5804)
  public void testValidIsNotHonoredValidateValue() {
    delegate.testValidIsNotHonoredValidateValue();
  }
}