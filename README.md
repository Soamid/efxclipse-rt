# efxclipse-rt

This repository contains the runtime components of the e(fx)clipse project allow people to build sophisticated UIs

## How to build

Current development branch is `3.x`.
Check this branch out, switch to the `releng\org.eclipse.fx.releng` and run the following command:

```
mvn clean verify
```

## Changes to original efxclipse-rt
- Selection layer in `StyledTextArea` was moved over text layer in order to cover lines with styled background.
- `StyledTextArea` scrollbars width can be adjusted now (originally it was fixed with hardcoded value of 16px).
`scrollbarWidthProperty` was added to `StyledTextArea` class.
