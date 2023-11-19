# HomeWork2.4
Educational project. Working with Exceptions

1. Write a static method that takes three parameters as input: login, password and confirmPassword
2. The Login parameter contains only Latin letters, numbers and an underscore.
The login parameter has a length limit - it must be equal to or less than 20 characters. If login is longer than 20 characters or contains invalid characters, then an exception must be thrown - `WrongLoginException`.
3. The Password parameter contains only Latin letters, numbers and underscores. If password is longer than 20 characters or contains invalid characters, then you must throw an exception - `WrongPasswordException`.
4. The password and confirmPassword parameters must be equal. If this requirement is not met, then a `WrongPasswordException` must be thrown.
