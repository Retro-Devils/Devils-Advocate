.class Lcom/digdroid/alman/dig/q3$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q3$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q3$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q3$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$a$a;->a:Lcom/digdroid/alman/dig/q3$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$a$a;->a:Lcom/digdroid/alman/dig/q3$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/q3$a;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
