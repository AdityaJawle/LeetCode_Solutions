import os
import re

README_FILE = "README.md"
TOTAL_LEETCODE_PROBLEMS = 3864

FOLDERS = [
    "Java",
    "SQL",
    "OracleSQL"
]


def get_solutions():
    solutions = []

    for folder in FOLDERS:

        if not os.path.exists(folder):
            continue

        for root, _, files in os.walk(folder):

            for file in files:

                if not file.endswith((".java", ".sql")):
                    continue

                filepath = os.path.join(root, file)

                try:
                    with open(filepath, "r", encoding="utf-8") as f:
                        content = f.read()
                except Exception:
                    continue

                # Supports both:
                #
                # Java:
                # // Problem: Two Sum
                # // Difficulty: Easy
                #
                # SQL:
                # -- Problem: Combine Two Tables
                # -- Difficulty: Easy

                problem_match = re.search(
                    r"(?m)^\s*(?://|--)\s*(?:Problem|Q\.)\s*:?\s*(.+?)\s*$",
                    content,
                    re.IGNORECASE
                )

                difficulty_match = re.search(
                    r"(?m)^\s*(?://|--)\s*Difficulty\s*:\s*(Easy|Medium|Hard)",
                    content,
                    re.IGNORECASE
                )

                if not problem_match or not difficulty_match:
                    print(f"⚠️ Skipping: {filepath}")
                    continue

                problem = problem_match.group(1).strip()
                difficulty = difficulty_match.group(1).capitalize()

                solutions.append({
                    "problem": problem,
                    "difficulty": difficulty,
                    "file": filepath
                })

    return solutions


def update_readme(solutions):

    easy = sum(
        1 for solution in solutions
        if solution["difficulty"] == "Easy"
    )

    medium = sum(
        1 for solution in solutions
        if solution["difficulty"] == "Medium"
    )

    hard = sum(
        1 for solution in solutions
        if solution["difficulty"] == "Hard"
    )

    solved = len(solutions)

    with open(README_FILE, "r", encoding="utf-8") as f:
        readme = f.read()

    progress = f"""## Progress

✅ {solved}/{TOTAL_LEETCODE_PROBLEMS} Problems Solved
- Easy: {easy}
- Medium: {medium}
- Hard: {hard}"""

    pattern = r"## Progress\s*.*?(?=\n## |\Z)"

    if re.search(pattern, readme, re.DOTALL):
        readme = re.sub(
            pattern,
            progress,
            readme,
            flags=re.DOTALL
        )
    else:
        readme += "\n\n" + progress + "\n"

    with open(README_FILE, "w", encoding="utf-8") as f:
        f.write(readme)

    print()
    print("========== LeetCode Progress ==========")
    print(f"Total solved : {solved}")
    print(f"Easy         : {easy}")
    print(f"Medium       : {medium}")
    print(f"Hard         : {hard}")
    print("========================================")


if __name__ == "__main__":
    solutions = get_solutions()
    update_readme(solutions)
