bug-trait-generic-inheritance
=============================

Groovy 2.3.0-beta-2 does not compile programs where a generic trait extends another generic traits with that same parameter.

In this we have the trait Applicative<M> and trait Monad<M> extends Applicative<M> with a single method named "left" that uses the type M.  A class that implements Applicative<List> compiles, but one that implements Monad<List> does not.

The output using Gradle 1.11, Windows 7 and Groovy 2.3.0-beta-2 is:

```
>gradle --daemon
:compileJava UP-TO-DATE
:compileGroovy
startup failed:
D:\repositories\bug-trait-generic-inheritance\src\main\groovy\com\github\mperry\L
istMonad.groovy: -1: The return type of java.lang.Object left(java.lang.Object, j
ava.lang.Object) in com.github.mperry.ListMonad is incompatible with java.util.Li
st in com.github.mperry.Applicative
. At [-1:-1]  @ line -1, column -1.
1 error

:compileGroovy FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileGroovy'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug o
ption to get more log output.

BUILD FAILED

Total time: 5.002 secs

```
