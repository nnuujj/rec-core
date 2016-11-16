package net.kimleo.rec.rule

import net.kimleo.rec.loader.RecCollection

interface RecRule {
    fun verify(recs: List<RecCollection>): Pair<Boolean, List<Result>>
}