package com.github.mperry

/**
 * Created by MarkPerry on 15/04/2014.
 */
trait Applicative<M> {

    def <A, B> M<A> left(M<A> a1, M<B> a2) {
        a1
    }

}
