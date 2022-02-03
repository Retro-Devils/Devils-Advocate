.class public final Landroidx/leanback/widget/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/j$a;
    }
.end annotation


# instance fields
.field private a:[Landroidx/leanback/widget/j$a;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/leanback/widget/j$a;

    new-instance v1, Landroidx/leanback/widget/j$a;

    invoke-direct {v1}, Landroidx/leanback/widget/j$a;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Landroidx/leanback/widget/j;->a:[Landroidx/leanback/widget/j$a;

    return-void
.end method


# virtual methods
.method public a()[Landroidx/leanback/widget/j$a;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/j;->a:[Landroidx/leanback/widget/j$a;

    return-object v0
.end method
