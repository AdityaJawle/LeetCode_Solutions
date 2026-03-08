-- Problem: Fix Names in a Table
-- Link: https://leetcode.com/problems/fix-names-in-a-table/submissions/1468576916/
-- Difficulty: Easy
-- Approach:
--   - Use SUBSTR to get the first character and the rest of the name.
--   - Use UPPER on the first character and LOWER on the remaining characters.
--   - Concatenate them to form the properly cased name.
--   - Order the result by user_id.

-- Table: Users

-- +----------------+---------+
-- | Column Name    | Type    |
-- +----------------+---------+
-- | user_id        | int     |
-- | name           | varchar |
-- +----------------+---------+
-- user_id is the primary key (column with unique values) for this table.
-- This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.
 

-- Write a solution to fix the names so that only the first character is uppercase and the rest are lowercase.

-- Return the result table ordered by user_id.

-- The result format is in the following example.

 

-- Example 1:

-- Input: 
-- Users table:
-- +---------+-------+
-- | user_id | name  |
-- +---------+-------+
-- | 1       | aLice |
-- | 2       | bOB   |
-- +---------+-------+
-- Output: 
-- +---------+-------+
-- | user_id | name  |
-- +---------+-------+
-- | 1       | Alice |
-- | 2       | Bob   |
-- +---------+-------+



select user_id, concat(upper(substr(name,1,1)), lower(substr(name, 2, length(name))))as name from users order by user_id;