;comment is beginning from a ;
; Comments start with semicolons.
;Clojure's code is formed by a "form",( )
; Clojure is written in "forms", which are just lists of things insides
; parentheses, separated by whitespace.
;Clojure treated the first element in the form be a function or Macro, others
;will treated be args
; The clojure reader assums that the first thing is a function or macro to call,
; and the rest are arguments.
;Clojure's first code statement is always using ns to specifiy current namespace

;The first call in a file should be ns, to set the namespace
(ns learnclojure)


;more basic sampel

(str "Hello" " " "World")
