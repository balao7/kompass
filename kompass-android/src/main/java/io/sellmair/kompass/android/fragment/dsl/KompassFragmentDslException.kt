package io.sellmair.kompass.android.fragment.dsl

import io.sellmair.kompass.core.exception.KompassException

class KompassFragmentDslException : KompassException {
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)

}