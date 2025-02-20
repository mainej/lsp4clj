(ns lsp4clj.protocols.feature-handler)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defprotocol  ILSPFeatureHandler
  (initialize [this project-root-uri client-capabilities client-settings work-done-token])
  (did-open [this doc])
  (did-change [this doc])
  (did-save [this doc])
  (execute-command [this doc])
  (did-close [this doc])
  (did-change-watched-files [this doc])
  (references [this doc])
  (completion [this doc])
  (completion-resolve-item [this doc])
  (prepare-rename [this doc])
  (rename [this doc])
  (hover [this doc])
  (signature-help [this doc])
  (formatting [this doc])
  (code-actions [this doc])
  (code-lens [this doc])
  (code-lens-resolve [this doc])
  (definition [this doc])
  (declaration [this doc])
  (implementation [this doc])
  (document-symbol [this doc])
  (document-highlight [this doc])
  (semantic-tokens-full [this doc])
  (semantic-tokens-range [this doc])
  (prepare-call-hierarchy [this doc])
  (call-hierarchy-incoming [this doc])
  (call-hierarchy-outgoing [this doc])
  (linked-editing-ranges [this doc])
  ;; (did-delete-files [this doc])
  (workspace-symbols [this doc])
  (range-formatting [this doc]))
