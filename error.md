```
Initializing core.typed ...
Building core.typed base environments ...
Finished building base environments
"Elapsed time: 3564.305528 msecs"
core.typed initialized.
Start collecting example.core
Finished collecting example.core
Collected 1 namespaces in 681.706266 msecs
Not checking clojure.core.typed (does not depend on clojure.core.typed)
Start checking example.core
nil Not checking example.core/MProto definition
13:  Not checking example.core/->MRec definition
Checked example.core in 1019.900549 msecs
WARNING: Type Checker: Definition missing: clojure.core/assert-same-protocol 
Hint: Use :no-check metadata with ann if this is an unchecked var
WARNING: Type Checker: Definition missing: clojure.core/-cache-protocol-fn 
Hint: Use :no-check metadata with ann if this is an unchecked var
WARNING: Type Checker: Definition missing: clojure.core/-reset-methods 
Hint: Use :no-check metadata with ann if this is an unchecked var
Checked 2 namespaces  in 1717.619162 msecs
Type Error (example/core.clj:9:1) Polymorphic function clojure.core/alter-meta! could not be applied to arguments:
Polymorphic Variables:
	b

Domains:
	clojure.lang.IReference [(t/U nil (IPersistentMap t/Any t/Any)) b ... b -> (t/U nil (IPersistentMap t/Any t/Any))] b ... b

Arguments:
	(Var t/Any t/Any) (t/All [b c d] (t/IFn [(t/Map b c) b c -> (t/Map b c)] [(t/Vec d) t/AnyInteger d -> (t/Vec d)])) (t/Val :doc) nil

Ranges:
	(t/U nil (IPersistentMap t/Any t/Any))

in: (clojure.core/alter-meta! (var example.core/MProto) clojure.core/assoc :doc nil)
in: (clojure.core/alter-meta! (var example.core/MProto) clojure.core/assoc :doc nil)


Type Error (example/core.clj:9:1) Untyped var reference: clojure.core/assert-same-protocol
Hint: Add the annotation for clojure.core/assert-same-protocol via check-ns or cf
in: (var clojure.core/assert-same-protocol)


Type Error (example/core.clj) Cannot call instance method example.core.MProto/myfn on type clojure.core.typed/Any
in: (.myfn gf__this__763 gf__obj__764)


Type Error (example/core.clj) Instance method example.core.MProto/myfn could not be applied to arguments:


Domains:
	Object

Arguments:
	t/Any

Ranges:
	(t/U nil Object)

in: (.myfn gf__this__763 gf__obj__764)
in: (.myfn gf__this__763 gf__obj__764)


Type Error (example/core.clj) Instance field __methodImplCache expected clojure.lang.AFunction, actual [clojure.core.typed/Any clojure.core.typed/Any -> clojure.core.typed/Any]
in: (.-__methodImplCache G__753)


Type Error (example/core.clj) Static method clojure.lang.Util/classOf could not be applied to arguments:


Domains:
	Object

Arguments:
	t/Any

Ranges:
	(t/U nil Class)

in: (clojure.lang.Util/classOf gf__this__766)
in: (clojure.lang.Util/classOf gf__this__766)


Type Error (example/core.clj) Cannot call instance method clojure.lang.MethodImplCache/fnFor on type (clojure.core.typed/U nil clojure.lang.MethodImplCache)
in: (.fnFor cache__5915__auto__ (clojure.lang.Util/classOf gf__this__766))


Type Error (example/core.clj) Cannot invoke type: IFn
in: (f__5916__auto__ gf__this__766 gf__obj__767)


Type Error (example/core.clj) Unannotated var clojure.core/-cache-protocol-fn
Hint: Add the annotation for clojure.core/-cache-protocol-fn via check-ns or cf
in: clojure.core/-cache-protocol-fn


Type Error (example/core.clj) Instance field __methodImplCache expected clojure.lang.AFunction, actual [clojure.core.typed/Any clojure.core.typed/Any -> Error]
in: (.-__methodImplCache f__5918__auto__)


Type Error (example/core.clj) Type mismatch:

Expected: 	(t/U nil MethodImplCache)

Actual: 	t/Any
in: cache__5917__auto__


Type Error (example/core.clj:9:1) Polymorphic function clojure.core/alter-var-root could not be applied to arguments:
Polymorphic Variables:
	w
	r
	b

Domains:
	(t/Var2 w r) [r b ... b -> w] b ... b

Arguments:
	(Var t/Any t/Any) (t/All [k v] (t/IFn [nil * -> nil] [(clojure.lang.IPersistentMap k v) (clojure.lang.IPersistentMap k v) * -> (clojure.lang.IPersistentMap k v)] [(t/Option (clojure.lang.IPersistentMap k v)) * -> (t/Option (clojure.lang.IPersistentMap k v))])) (t/HMap :mandatory {:method-builders (APersistentMap (t/Var2 t/Nothing t/Any) [t/Any -> [t/Any t/Any -> Error] :filters {:then tt, :else ff}]), :method-map (t/HMap :mandatory {:myfn (t/Val :myfn)} :complete? true), :var (Var t/Any t/Any), :sigs (t/HMap :mandatory {:myfn (t/HMap :mandatory {:file (t/Val "example/core.clj"), :line (t/Val 10), :column (t/Val 4), :end-line (t/Val 10), :end-column (t/Val 9), :name (t/Val myfn), :arglists (ISeq (t/HVec [(t/Val this) (t/Val obj)])), :doc nil} :complete? true)} :complete? true), :on (t/Val example.core.MProto), :on-interface (t/Val example.core.MProto)} :complete? true)

Ranges:
	w

in: (clojure.core/alter-var-root (var example.core/MProto) clojure.core/merge (clojure.core/assoc {:on (quote example.core.MProto), :on-interface example.core.MProto} :sigs (quote {:myfn {:doc nil, :arglists ([this obj]), :name myfn, :end-column 9, :end-line 10, :column 4, :line 10, :file "example/core.clj"}}) :var (var example.core/MProto) :method-map {:myfn :myfn} :method-builders {(clojure.core/intern clojure.core/*ns* (clojure.core/with-meta (quote myfn) (clojure.core/merge (quote {:doc nil, :arglists ([this obj]), :name myfn, :end-column 9, :end-line 10, :column 4, :line 10, :file "example/core.clj"}) {:protocol (var example.core/MProto)}))) (fn* ([cache__5917__auto__] (let* [G__754 (fn* ([gf__this__763 gf__obj__764] (.myfn gf__this__763 gf__obj__764))) f__5918__auto__ (fn* G__753 ([gf__this__766 gf__obj__767] (let* [cache__5915__auto__ (.-__methodImplCache G__753) f__5916__auto__ (.fnFor cache__5915__auto__ (clojure.lang.Util/classOf gf__this__766))] (if f__5916__auto__ (f__5916__auto__ gf__this__766 gf__obj__767) ((clojure.core/-cache-protocol-fn G__753 gf__this__766 example.core.MProto G__754) gf__this__766 gf__obj__767)))))] (do (set! (.-__methodImplCache f__5918__auto__) cache__5917__auto__) f__5918__auto__))))}))
in: (clojure.core/alter-var-root (var example.core/MProto) clojure.core/merge (clojure.core/assoc {:on (quote example.core.MProto), :on-interface example.core.MProto} :sigs (quote {:myfn #}) :var (var example.core/MProto) ...))


Type Error (example/core.clj) Unannotated var clojure.core/-reset-methods
Hint: Add the annotation for clojure.core/-reset-methods via check-ns or cf
in: clojure.core/-reset-methods


Type Checker: Found 13 errors
Found errors
Subprocess failed
```