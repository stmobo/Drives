# Drives
This repo is dedicated to implementing modular and flexible code for
drivetrains under the package name `org.usfirst.frc.team5002.drive`.

## Basic Structure
The base interface, `Drive`, contains methods that *all* bases, including
swerve, tank, Mecanum, and others, must implement.  Then, for each drivetrain
type, there will be a specialized interface.
<br><br>
Currently, the focus will be on swerve; so, under the package
`org.usfirst.frc.team5002.drive.swerve`, a specialized `SwerveDrive` interface
will be created, extending the `Drive` interface and adding on extra methods
specialized to swerve (such as `lock()` and `driveAtAngle()`). Each "flavor" of
swerve will have to implement the `SwerveDrive` interface.

## How to contribute
All programmers on swerve team will be expected to make contributions.  We will
be using the _fork-and-PR_ pattern to make sure only good code gets into the
`master` branch.  Below is a quick overview on how to do this:
1. Download and install ![git](https://git-scm.com/downloads).
2. Get a text editor of your choice.  If you are new to Java,
   I recommend you install ![Eclipse IDE](https://www.eclipse.org/downloads/).
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
    into the main repo, open a pull request.
13. To do this, go to your fork on GitHub.  You will see a gray bar above your
    files that says something like "This branch is x commits ahead of
    dragonrobotics:master".  On the right side of that bar, you will see a button
    that says "Pull Request". Click on that.
