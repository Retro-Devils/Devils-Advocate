.class public Lb/e/b/k/k;
.super Lb/e/b/k/i;
.source ""


# instance fields
.field private A0:I

.field private B0:I

.field private C0:I

.field private D0:I

.field private E0:I

.field private F0:I

.field private G0:Z

.field private H0:I

.field private I0:I

.field protected J0:Lb/e/b/k/m/b$a;

.field K0:Lb/e/b/k/m/b$b;

.field private y0:I

.field private z0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/e/b/k/i;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb/e/b/k/k;->y0:I

    iput v0, p0, Lb/e/b/k/k;->z0:I

    iput v0, p0, Lb/e/b/k/k;->A0:I

    iput v0, p0, Lb/e/b/k/k;->B0:I

    iput v0, p0, Lb/e/b/k/k;->C0:I

    iput v0, p0, Lb/e/b/k/k;->D0:I

    iput v0, p0, Lb/e/b/k/k;->E0:I

    iput v0, p0, Lb/e/b/k/k;->F0:I

    iput-boolean v0, p0, Lb/e/b/k/k;->G0:Z

    iput v0, p0, Lb/e/b/k/k;->H0:I

    iput v0, p0, Lb/e/b/k/k;->I0:I

    new-instance v0, Lb/e/b/k/m/b$a;

    invoke-direct {v0}, Lb/e/b/k/m/b$a;-><init>()V

    iput-object v0, p0, Lb/e/b/k/k;->J0:Lb/e/b/k/m/b$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lb/e/b/k/k;->K0:Lb/e/b/k/m/b$b;

    return-void
.end method


# virtual methods
.method public H0()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lb/e/b/k/i;->x0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lb/e/b/k/i;->w0:[Lb/e/b/k/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lb/e/b/k/e;->n0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public I0()Z
    .locals 1

    iget-boolean v0, p0, Lb/e/b/k/k;->G0:Z

    return v0
.end method

.method public b(Lb/e/b/k/f;)V
    .locals 0

    invoke-virtual {p0}, Lb/e/b/k/k;->H0()V

    return-void
.end method
