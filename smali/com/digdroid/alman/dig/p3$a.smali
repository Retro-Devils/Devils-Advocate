.class Lcom/digdroid/alman/dig/p3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p3;->a(Landroid/app/Activity;Lcom/digdroid/alman/dig/r3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$a;->b:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/p3$a;->c:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$a;->b:Landroid/app/Activity;

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance v0, Lcom/digdroid/alman/dig/p3$a$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/p3$a$a;-><init>(Lcom/digdroid/alman/dig/p3$a;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method
