.class Lcom/digdroid/alman/dig/q2$o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->F3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$o0;->c:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$o0;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    new-instance p1, Lcom/digdroid/alman/dig/z2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$o0;->b:Landroid/app/Activity;

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/z2;-><init>(Landroid/app/Activity;)V

    new-instance v0, Lcom/digdroid/alman/dig/q2$o0$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q2$o0$a;-><init>(Lcom/digdroid/alman/dig/q2$o0;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/z2;->a(Lcom/digdroid/alman/dig/z2$b;)V

    return-void
.end method
