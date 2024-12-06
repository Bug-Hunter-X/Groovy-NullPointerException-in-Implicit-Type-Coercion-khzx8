# Groovy NullPointerException in Implicit Type Coercion

This example demonstrates an uncommon error in Groovy related to implicit type coercion and null values.  The `myMethod` function aims to return the larger of two numbers, but it fails when a null value is passed.

The problem stems from Groovy's dynamic typing. When comparing a `null` with an integer, a `NullPointerException` is thrown instead of the expected implicit conversion to 0 or a default value.

The provided solution shows how to explicitly handle null values to prevent the error and provide more robust behavior.