package com.programmingwithmati.functional.subsequence

import iterEncodeString
import org.junit.jupiter.api.Test

internal class IterLengthEncodingKtTest {

    @Test
    fun test() {
        val longString =
            "qpwtrnwweajryeptuqjzoklizswepnrxueifgijatglonpyjdqwdleqzakmkclryhuvcpzmqplgfsfzbprbrvquagfzrllhjtxmw" +
                    "zrqjupvfhnmilsgedkxyctbwoaqzbrzyroaxbdjtswfekolnpcmyjhpgtivsnulvcbzoadirgnpdpzcqtzpjnnkdxjxzvzjdgdzw" +
                    "wbsgzeznkwjrnzckvbnobhzmvmlucfugkkhrmdiyqzqwsptkzdrktuiifhmfmpfxdzqavahqleqwyqrqdzryiltdbyvwuojnksf" +
                    "rvkvjcbsnizbgjwvzeunxnwozcdcihptwsdpcjynfckbrmquikdzwxnzbwrzuhnjfiodolddvzgljprywkohlttwlbmgjfouqe" +
                    "vubvnqtzljsjgycxekltwqtodswtxjywcphklzhtazdysyxnmftltbjjppaxqeqipcvrtxvcxgwlwzsbbkzmjzufbhpfmjldcg"

        listOf(
            "hello",
            "aaabbbaaa",
            "abcd",
            "aaaaa",
            "abbbbbcddddeeeee",
            "pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp",
            "abcdeeeefffg",
            "bb",
            "tuv",
            "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz",
            longString
        ).map { encodeString(it) }
        .forEach(::println)

    }

}
