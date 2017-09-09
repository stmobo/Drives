# How to make Contributions

All programmers on swerve team will be expected to make contributions.  We will
be using the _fork-and-PR_ pattern to make sure only good code gets into the
`master` branch.  Below is a quick overview on how to do this:
1. Download and install [git](https://git-scm.com/downloads).
2. Get a text editor of your choice.  If you are new to Java,
   I recommend you install [Eclipse IDE](https://www.eclipse.org/downloads/).
   It will show you errors in your code as you type.  Also, it has lots of other
   tools such as auto-format, advanced auto-complete, javadoc, and more.
3. On GitHub, navigate to the Drives repo under the dragonrobotics organization.
4. In the upper-right section of the window, you will see three buttons:
	* Watch/unwatch
	* Star
	* Fork

   Click on "fork" and select your account. You now have your own copy of this
   repo to do whatever you want.
5. On your fork, find the green button that says "Clone or download". Click on
   the dropdown and copy the link.
6. In a terminal session on your computer (or on Git Bash if you are on windows),
   clone your fork; type in the command `git clone <url>` where `<url>` is that
   link you copied earlier.  You should now have a folder named "Drives" created.
7. Make whatever changes you want to make.  Create files, modify files, etc.
8. Use `git status` to see which files you modified.
9. Use `git add <files>` to add those modified files to your commit.
10. Commit your changes with `git commit -m "insert your message here"`.  Make
    sure your commit message is something descriptive of the changes you made.
    Try not to use _asdf_ or _AAAAAAAHHHHHHHH_ but if you do I completely
    understand.
11. Repeat steps 7-10 as much as you want; or, if you want to push your changes
    up to your fork on GitHub, use `git push`.  git may ask you for your GitHub
    credentials the first time.
12. When you are done working on your task and you think it is ready to merge
    into the main repo, open a pull request.  But before you do this, here are a
    few tips to make sure your code passes Code Review and makes it into the `master`
    branch:
    * Make sure the code is well-formatted.  In Eclipse, you can hit `Ctrl-Shift-F`
      or `Cmd-Shift-F` (on a mac) to automatically format a file.  In Atom or Vim,
      there are plugins to do this for you.  Or just do it manually.
    * Make sure the code is well-commented.  Use javadoc-style comments for public
      variables, classes, and public methods (google it).
    * For each file or class, take credit for your changes.  You can use the `@author`
      javadoc tag to mark classes as authored by you.
    * Variable naming is important.  In most cases except counter variables, do not
      name your variables and methods with single letters. But also don't name your
      variable `anUneccessarilyExtraLongVariableNameThatIsAPainToTypeAndLookAt`.
      Name classes in `PascalCase`, method/variable names in `camelCase`, and constant
      names in `ALL_CAPS`.  If you can't get all this your first time around, just
      go ahead and make the pull request.  We'll help you out there.
13. To make the pull request, go to your fork on GitHub.  You will see a gray bar above your
    files that says something like "This branch is x commits ahead of
    dragonrobotics:master".  On the right side of that bar, you will see a button
    that says "Pull Request". Click on that.
14. Hopefully, you will see green text that says "Able to merge."  If you don't,
    this is really bad, and get help on Slack. We will help you resolve your merge
    conflicts.
15. Click on that green "Create pull request" button.
16. In the box, type a description of your changes.  You can use Markdown syntax for this.
    This means \_underlines around text\_ for _italic text_, \*asterisks around text\* for
    *bold and emphasized text*, \~tildes\~ for ~strikethrough~, hyphens for lists, etc.
    Or just use plain english if fancy is not your thing.
 17. Click on the "Create pull request" button.  It's ready for code review.
