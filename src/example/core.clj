(ns example.core
  (:import java.io.File)
  (:require [clojure.core.typed :as t]))

(declare dispatcher)

(t/ann-protocol MProto
                myfn (t/IFn [MProto t/Any -> String]))
(defprotocol MProto
  (myfn [this obj]))

(t/ann-record MRec [name :- String])
(defrecord MRec [name]
  MProto
  (myfn [this obj] (dispatcher this obj)))

(t/ann dispatcher (t/IFn [MRec t/Any -> String]))
(defmulti dispatcher (fn [rec obj] (class obj)))

(defmethod dispatcher
  File
  [rec obj]
  (:name rec))

(defn -main [& args]
  (let [rec (MRec. "myname")
        file (File. ".")]
    (when (not (nil? file))
      (println (myfn rec file)))))
