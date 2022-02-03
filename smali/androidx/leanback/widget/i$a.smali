.class final Landroidx/leanback/widget/i$a;
.super Landroidx/leanback/widget/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private g:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Landroidx/leanback/widget/j$a;-><init>()V

    iput p1, p0, Landroidx/leanback/widget/i$a;->g:I

    return-void
.end method


# virtual methods
.method public j(Landroid/view/View;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/i$a;->g:I

    invoke-static {p1, p0, v0}, Landroidx/leanback/widget/k;->a(Landroid/view/View;Landroidx/leanback/widget/j$a;I)I

    move-result p1

    return p1
.end method
