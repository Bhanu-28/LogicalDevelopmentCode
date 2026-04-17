# Bhanu Daily Flow System

This folder turns the plan into spreadsheet-ready files you can use every day from `2026-04-15` to `2026-07-02`.

## Files
- `bhanu-daily-tracker-2026.csv`: daily checklist and score tracker with one row per date.
- `bhanu-weekly-review-2026.csv`: Sunday review sheet for weekly totals and adjustments.
- `bhanu-pattern-notebook.csv`: pattern-recognition notebook template for DSA.

## Daily Templates
### Workday
| Time | Block |
|---|---|
| 5:30 AM - 7:30 AM | DSA deep work |
| 7:30 AM - 8:00 AM | Breakfast |
| 8:00 AM - 9:30 AM | Workout + cooldown + bath |
| 9:30 AM - 3:30 PM | Job |
| 3:30 PM - 4:30 PM | Lunch + reset |
| 4:30 PM - 6:30 PM | Project or AI course |
| 6:30 PM - 7:30 PM | Dinner |
| 7:30 PM - 9:30 PM | DSA practice / revision / mock |
| 9:30 PM - 10:30 PM | Wind down |
| 10:30 PM - 5:30 AM | Sleep |

### Weekend
| Time | Block |
|---|---|
| 6:00 AM - 8:00 AM | DSA problem solving |
| 8:00 AM - 8:30 AM | Breakfast |
| 8:30 AM - 10:00 AM | Workout |
| 10:00 AM - 12:00 PM | Project build or AI course |
| 12:00 PM - 1:00 PM | Lunch |
| 1:00 PM - 3:00 PM | DSA timed set / revision |
| 3:00 PM - 5:00 PM | Catch-up, review, or rest |
| 7:00 PM - 8:00 PM | Dinner |
| 10:30 PM | Sleep target |

## Phase Cadence
### Phase 1: `2026-04-15` to `2026-05-14`
- DSA remains the primary growth track.
- Project block alternates:
- `Mon, Wed, Fri`: microservices
- `Tue, Thu, Sat`: full stack
- `Sun`: review, docs, backlog, deployment notes

### Phase 2: `2026-05-15` to `2026-06-01`
- AI becomes the primary `Project/AI 2h` block.
- DSA continues daily.
- Project work shifts into maintenance and continuity.

### Continuation: `2026-06-02` to `2026-07-02`
- Daily tracker keeps the same rhythm.
- Focus becomes AI completion, DSA revision, mock sets, and project maintenance.

## How To Fill The Daily Tracker
- Enter `1` for complete, `0.5` for partial, and `0` for missed in:
- `DSA Morning 2h`
- `Workout 1.5h`
- `Job 6h`
- `Project/AI 2h`
- `DSA Evening 2h`
- `Sleep 6.5h+`
- `Daily score %` is prefilled with a formula based on those six habit columns.
- Keep `Main DSA topic`, `Pattern learned`, and `Project/AI task done` as your daily anchor. Do not add more than one main topic in each.

## Weekly Review Rules
- Review every Sunday using `bhanu-weekly-review-2026.csv`.
- Count total DSA hours, total Project/AI hours, solved problems, and top three weak patterns.
- If you have `3` days below `70`, reduce the next week by `20%`.
- If you have `5` or more days above `85`, add one timed mock or interview set on the weekend.

## Pattern Notebook Rules
For each DSA topic, fill one row in `bhanu-pattern-notebook.csv` with:
- pattern name
- when to identify it
- key data structure
- core logic
- common mistake
- two standard problems
- one variation problem

## Operating Rules
- Decide tomorrow's main topic the previous night.
- If a block is missed, move it to the weekend catch-up block instead of reshuffling the whole day.
- If you are mentally tired, use revision or notes, not a heavy new concept.
- Do not add new courses or resources during this plan.
