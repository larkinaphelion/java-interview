# Java Interview Project

Plain Java 25 + Maven + JUnit 5 + AssertJ. No frameworks.

- Code: `src/main/java/com/interview/`
- Tests: `src/test/java/com/interview/`
- Run/debug and tests are driven from VS Code (Java Extension Pack): Run button / Testing panel.
- Build check from Claude: `.\mvnw.cmd -q test` (Maven wrapper; no global Maven needed).

## Working style

- Write the test first when adding behaviour (see `tdd-workflow` skill).
- Keep solutions readable: clear names, small methods, explicit edge cases (null/empty/overflow).
- State time/space complexity for algorithmic solutions.

## Installed from everything-claude-code (Java subset)

Agents: `java-reviewer`, `java-build-resolver`, `code-reviewer`, `code-simplifier`, `tdd-guide`,
`refactor-cleaner`, `silent-failure-hunter`, `type-design-analyzer`, `planner`.

Commands: `/ecc-code-review`, `/build-fix`, `/test-coverage`, `/refactor-clean`, `/ecc-plan`.

Skills: `java-coding-standards`, `coding-standards`, `tdd-workflow`, `verification-loop`.

Rules: `.claude/rules/common/*` and `.claude/rules/java/*`.

Source: https://github.com/affaan-m/everything-claude-code (MIT, see `.claude/ECC-LICENSE`).
